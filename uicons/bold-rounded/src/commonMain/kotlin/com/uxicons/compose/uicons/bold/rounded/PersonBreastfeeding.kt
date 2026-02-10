package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBreastfeeding: ImageVector? = null

val Icons.Br.PersonBreastfeeding: ImageVector
    get() = _PersonBreastfeeding ?: UXIcon(name = "PersonBreastfeeding") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(15.31f, 0f, 12f, 0f)
            reflectiveCurveTo(6f, 2.69f, 6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(17f, 20f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(11f, 21.2f)
            lineToRelative(4.2f, 2.8f)
            horizontalLineToRelative(-5.41f)
            lineToRelative(-1.13f, -0.75f)
            curveToRelative(-0.42f, -0.28f, -0.67f, -0.75f, -0.67f, -1.25f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.7f)
            close()
            moveTo(21.97f, 23.52f)
            lineToRelative(-0.47f, 0.48f)
            horizontalLineToRelative(-4.23f)
            lineToRelative(2.58f, -2.59f)
            curveToRelative(0.15f, -0.15f, 0.2f, -0.38f, 0.12f, -0.55f)
            curveToRelative(-1.57f, -3.0f, -4.62f, -4.86f, -7.96f, -4.86f)
            reflectiveCurveToRelative(-6.38f, 1.86f, -7.96f, 4.86f)
            curveToRelative(-0.09f, 0.16f, -0.04f, 0.39f, 0.12f, 0.55f)
            lineToRelative(2.58f, 2.59f)
            lineTo(2.51f, 24f)
            lineToRelative(-0.47f, -0.48f)
            curveToRelative(-1.07f, -1.07f, -1.34f, -2.74f, -0.65f, -4.06f)
            curveToRelative(2.09f, -3.99f, 6.16f, -6.47f, 10.61f, -6.47f)
            reflectiveCurveToRelative(8.52f, 2.48f, 10.61f, 6.47f)
            curveToRelative(0.69f, 1.32f, 0.42f, 2.99f, -0.65f, 4.06f)
            close()
        }
    }.also { _PersonBreastfeeding = it }
