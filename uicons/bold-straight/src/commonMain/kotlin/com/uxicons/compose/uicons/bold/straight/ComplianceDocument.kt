package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComplianceDocument: ImageVector? = null

val Icons.Bs.ComplianceDocument: ImageVector
    get() = _ComplianceDocument ?: UXIcon(name = "ComplianceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.36f, 11.76f)
                lineToRelative(-3.86f, -1.28f)
                lineToRelative(-3.87f, 1.28f)
                curveToRelative(-0.98f, 0.33f, -1.64f, 1.24f, -1.64f, 2.27f)
                verticalLineToRelative(3.48f)
                curveToRelative(0f, 3.52f, 3.56f, 5.58f, 4.65f, 6.12f)
                lineToRelative(0.79f, 0.4f)
                lineToRelative(0.81f, -0.33f)
                curveToRelative(1.11f, -0.45f, 4.75f, -2.22f, 4.75f, -6.19f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.03f, -0.66f, -1.94f, -1.64f, -2.27f)
                close()
                moveTo(21f, 17.5f)
                curveToRelative(0f, 1.74f, -1.53f, 2.76f, -2.44f, 3.21f)
                curveToRelative(-0.88f, -0.51f, -2.56f, -1.69f, -2.56f, -3.21f)
                verticalLineToRelative(-3.03f)
                lineToRelative(2.5f, -0.83f)
                lineToRelative(2.5f, 0.83f)
                verticalLineToRelative(3.03f)
                close()
                moveTo(14.55f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(2.34f)
                horizontalLineToRelative(-8f)
                lineTo(12f, 3f)
                lineTo(3f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(8.92f)
                curveToRelative(0.7f, 1.27f, 1.69f, 2.26f, 2.63f, 3f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11.13f, 13f)
                horizontalLineToRelative(-6.13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.67f)
                curveToRelative(-1.29f, 0.55f, -2.22f, 1.66f, -2.54f, 3f)
                close()
            }
        }.also { _ComplianceDocument = it}
