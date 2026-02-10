package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebTest: ImageVector? = null

val Icons.Ss.WebTest: ImageVector
    get() = _WebTest ?: UXIcon(name = "WebTest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 1f)
                lineTo(2f, 1f)
                curveTo(0.35f, 1f, -1f, 2.35f, -1f, 4f)
                verticalLineToRelative(4f)
                lineTo(23f, 8f)
                lineTo(23f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(6.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(-1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 10f)
                lineTo(-1f, 10f)
                verticalLineToRelative(13f)
                close()
                moveTo(11.54f, 13f)
                horizontalLineToRelative(7.46f)
                verticalLineToRelative(2f)
                lineTo(9.5f, 15f)
                lineToRelative(2.04f, -2f)
                close()
                moveTo(11.54f, 18f)
                horizontalLineToRelative(7.46f)
                verticalLineToRelative(2f)
                lineTo(9.5f, 20f)
                lineToRelative(2.04f, -2f)
                close()
                moveTo(4.17f, 12.7f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.27f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                close()
                moveTo(4.17f, 17.7f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.27f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                close()
            }
        }.also { _WebTest = it}
