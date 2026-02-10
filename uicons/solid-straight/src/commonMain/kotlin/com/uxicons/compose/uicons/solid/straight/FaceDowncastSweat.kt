package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDowncastSweat: ImageVector? = null

val Icons.Ss.FaceDowncastSweat: ImageVector
    get() = _FaceDowncastSweat ?: UXIcon(name = "FaceDowncastSweat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 4.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1f, 5.88f, 1f, 4.5f)
                curveTo(1f, 2.46f, 3.5f, 0f, 3.5f, 0f)
                curveTo(3.5f, 0f, 6f, 2.51f, 6f, 4.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -1.41f, 0.26f, -2.75f, 0.7f, -4.0f)
                lineTo(0.7f, 8.0f)
                curveToRelative(0.77f, 0.62f, 1.74f, 1.0f, 2.8f, 1.0f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -1.17f, -0.49f, -2.35f, -1.09f, -3.35f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(1.55f, -0.73f, 3.27f, -1.15f, 5.09f, -1.15f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(6f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(15.6f, 17.2f)
                curveToRelative(-0.07f, -0.05f, -1.63f, -1.2f, -3.6f, -1.2f)
                reflectiveCurveToRelative(-3.53f, 1.15f, -3.6f, 1.2f)
                lineToRelative(1.19f, 1.61f)
                curveToRelative(0.01f, -0.01f, 1.12f, -0.81f, 2.41f, -0.81f)
                reflectiveCurveToRelative(2.4f, 0.8f, 2.4f, 0.8f)
                lineToRelative(1.2f, -1.6f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FaceDowncastSweat = it}
