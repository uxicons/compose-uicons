package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComplianceDocument: ImageVector? = null

val Icons.Ss.ComplianceDocument: ImageVector
    get() = _ComplianceDocument ?: UXIcon(name = "ComplianceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.45f, 24.11f)
                lineToRelative(-0.6f, -0.31f)
                curveToRelative(-1.14f, -0.57f, -4.85f, -2.7f, -4.85f, -6.27f)
                verticalLineToRelative(-3.54f)
                curveToRelative(0f, -0.86f, 0.55f, -1.62f, 1.37f, -1.9f)
                lineToRelative(4.13f, -1.37f)
                lineToRelative(4.13f, 1.37f)
                curveToRelative(0.82f, 0.27f, 1.37f, 1.03f, 1.37f, 1.9f)
                verticalLineToRelative(3.54f)
                curveToRelative(0f, 4.03f, -3.76f, 5.86f, -4.92f, 6.32f)
                lineToRelative(-0.63f, 0.25f)
                close()
                moveTo(15f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineTo(15f, 0.59f)
                close()
                moveTo(11.44f, 20f)
                horizontalLineToRelative(-6.44f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.01f)
                curveToRelative(-0.01f, -0.15f, -0.01f, -0.31f, -0.01f, -0.46f)
                verticalLineToRelative(-1.54f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, -1.73f, 1.1f, -3.25f, 2.74f, -3.79f)
                lineToRelative(4.76f, -1.58f)
                lineToRelative(1.5f, 0.5f)
                verticalLineToRelative(-2.12f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(14.48f)
                curveToRelative(-1.17f, -0.95f, -2.4f, -2.28f, -3.04f, -4f)
                close()
            }
        }.also { _ComplianceDocument = it}
