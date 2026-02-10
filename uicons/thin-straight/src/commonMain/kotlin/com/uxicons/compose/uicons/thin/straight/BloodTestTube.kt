package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTube: ImageVector? = null

val Icons.Ts.BloodTestTube: ImageVector
    get() = _BloodTestTube ?: UXIcon(name = "BloodTestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.53f, 11.46f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, -0.0f, -7.08f)
                close()
                moveTo(19.83f, 17.83f)
                curveToRelative(-1.51f, 1.51f, -4.15f, 1.51f, -5.66f, 0f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.83f)
                lineToRelative(2.83f, -2.77f)
                lineToRelative(2.83f, 2.77f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.1f, 0f, 5.66f)
                close()
                moveTo(9f, 23.0f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(8.12f)
                lineToRelative(0.88f, -0.86f)
                lineTo(14f, 1f)
                horizontalLineToRelative(2f)
                lineTo(16f, 0f)
                lineTo(2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(2.01f, 0f, 3.74f, -1.2f, 4.53f, -2.92f)
                curveToRelative(-0.29f, -0.17f, -0.57f, -0.35f, -0.84f, -0.56f)
                curveToRelative(-0.6f, 1.46f, -2.03f, 2.48f, -3.7f, 2.48f)
                close()
                moveTo(13f, 1f)
                verticalLineToRelative(7f)
                lineTo(5f, 8f)
                lineTo(5f, 1f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _BloodTestTube = it}
