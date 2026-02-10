package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceTissue: ImageVector? = null

val Icons.Bs.FaceTissue: ImageVector
    get() = _FaceTissue ?: UXIcon(name = "FaceTissue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                reflectiveCurveToRelative(-2f, 2f, -2f, 3f)
                reflectiveCurveToRelative(2f, 3f, 2f, 3f)
                curveToRelative(-1.63f, 0f, -5f, -0.73f, -5f, -3f)
                reflectiveCurveToRelative(3.37f, -3f, 5f, -3f)
                close()
                moveTo(11f, 9f)
                curveToRelative(0f, -2.27f, -3.37f, -3f, -5f, -3f)
                curveToRelative(0f, 0f, 2f, 2f, 2f, 3f)
                reflectiveCurveToRelative(-2f, 3f, -2f, 3f)
                curveToRelative(1.63f, 0f, 5f, -0.73f, 5f, -3f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 0.66f, 0.07f, 1.3f, 0.17f, 1.93f)
                lineToRelative(2.95f, -0.54f)
                curveToRelative(-0.07f, -0.45f, -0.12f, -0.91f, -0.12f, -1.39f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                curveToRelative(-0.47f, 0f, -0.93f, -0.05f, -1.38f, -0.12f)
                lineToRelative(-0.54f, 2.95f)
                curveToRelative(0.63f, 0.1f, 1.26f, 0.17f, 1.92f, 0.17f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(2.28f, 18.7f)
                lineToRelative(-1.35f, 4.36f)
                lineToRelative(4.36f, -1.31f)
                lineToRelative(2.73f, 2.19f)
                lineToRelative(1.78f, -9.75f)
                lineTo(0.1f, 15.97f)
                lineToRelative(2.18f, 2.73f)
                close()
                moveTo(11.18f, 17.8f)
                lineToRelative(0.81f, 0.81f)
                lineToRelative(1.51f, -1.49f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3.56f, -3.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-1.48f, -1.48f)
                lineToRelative(-1.76f, 1.74f)
                lineToRelative(-0.58f, 3.17f)
                close()
            }
        }.also { _FaceTissue = it}
