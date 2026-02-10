package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDowncastSweat: ImageVector? = null

val Icons.Rs.FaceDowncastSweat: ImageVector
    get() = _FaceDowncastSweat ?: UXIcon(name = "FaceDowncastSweat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -1.41f, 0.26f, -2.75f, 0.7f, -4.0f)
                curveToRelative(0.52f, 0.42f, 1.13f, 0.73f, 1.8f, 0.89f)
                curveToRelative(-0.32f, 0.98f, -0.51f, 2.03f, -0.51f, 3.12f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                curveToRelative(-1.52f, 0f, -2.96f, 0.35f, -4.25f, 0.96f)
                curveToRelative(-0.2f, -0.64f, -0.5f, -1.26f, -0.83f, -1.81f)
                curveToRelative(1.55f, -0.73f, 3.27f, -1.15f, 5.09f, -1.15f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(3.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveTo(6f, 2.51f, 3.5f, 0f, 3.5f, 0f)
                curveTo(3.5f, 0f, 1f, 2.46f, 1f, 4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.4f, 17.2f)
                lineToRelative(1.19f, 1.61f)
                curveToRelative(0.01f, -0.01f, 1.12f, -0.81f, 2.41f, -0.81f)
                reflectiveCurveToRelative(2.4f, 0.8f, 2.4f, 0.8f)
                lineToRelative(1.19f, -1.6f)
                curveToRelative(-0.07f, -0.05f, -1.63f, -1.2f, -3.6f, -1.2f)
                reflectiveCurveToRelative(-3.53f, 1.15f, -3.6f, 1.2f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(6f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FaceDowncastSweat = it}
