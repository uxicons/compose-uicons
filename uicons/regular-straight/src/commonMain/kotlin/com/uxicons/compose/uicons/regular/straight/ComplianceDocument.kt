package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComplianceDocument: ImageVector? = null

val Icons.Rs.ComplianceDocument: ImageVector
    get() = _ComplianceDocument ?: UXIcon(name = "ComplianceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 17f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 13.62f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 4.03f, -3.76f, 5.86f, -4.92f, 6.32f)
                lineToRelative(-0.63f, 0.25f)
                lineToRelative(-0.6f, -0.31f)
                curveToRelative(-1.14f, -0.57f, -4.85f, -2.7f, -4.85f, -6.27f)
                verticalLineToRelative(-3.91f)
                curveToRelative(0f, -0.86f, 0.55f, -1.62f, 1.37f, -1.9f)
                lineToRelative(4.13f, -1.37f)
                lineToRelative(4.13f, 1.37f)
                curveToRelative(0.82f, 0.27f, 1.37f, 1.03f, 1.37f, 1.9f)
                close()
                moveTo(22f, 13.62f)
                lineToRelative(-3.5f, -1.16f)
                lineToRelative(-3.5f, 1.16f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 2.28f, 2.63f, 3.89f, 3.55f, 4.38f)
                curveToRelative(1.03f, -0.46f, 3.45f, -1.8f, 3.45f, -4.38f)
                verticalLineToRelative(-3.91f)
                close()
                moveTo(14.48f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(9.41f)
                lineToRelative(7.59f, 7.59f)
                verticalLineToRelative(1.41f)
                horizontalLineToRelative(-9f)
                lineTo(11f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(10.54f)
                curveToRelative(0.59f, 0.79f, 1.27f, 1.46f, 1.94f, 2f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                close()
            }
        }.also { _ComplianceDocument = it}
