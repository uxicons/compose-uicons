package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebTest: ImageVector? = null

val Icons.Rs.WebTest: ImageVector
    get() = _WebTest ?: UXIcon(name = "WebTest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 3f)
                lineTo(21f, 3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                lineTo(2f, 8f)
                lineTo(2f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 21f)
                lineTo(2f, 10f)
                lineTo(22f, 10f)
                verticalLineToRelative(11f)
                lineTo(2f, 21f)
                close()
                moveTo(3f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(7f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.0f, 10.37f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.27f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                close()
                moveTo(10.0f, 15.37f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.27f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                close()
                moveTo(13.54f, 12f)
                horizontalLineToRelative(5.46f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7.5f)
                lineToRelative(2.04f, -2f)
                close()
                moveTo(13.54f, 17f)
                horizontalLineToRelative(5.46f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7.5f)
                lineToRelative(2.04f, -2f)
                close()
            }
        }.also { _WebTest = it}
