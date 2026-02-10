package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperUnder: ImageVector? = null

val Icons.Rr.ToiletPaperUnder: ImageVector
    get() = _ToiletPaperUnder ?: UXIcon(name = "ToiletPaperUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                reflectiveCurveToRelative(0.45f, -1.5f, 1f, -1.5f)
                close()
                moveTo(7.5f, 7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 21.35f)
                curveToRelative(0f, 1.46f, -1.19f, 2.65f, -2.65f, 2.65f)
                horizontalLineToRelative(-8.35f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.8f, 0f, -5f, -3.73f, -5f, -8.5f)
                reflectiveCurveTo(2.2f, 0f, 5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(2.8f, 0f, 5f, 3.73f, 5f, 8.5f)
                curveToRelative(0f, 0f, -0.01f, 8.88f, -0.01f, 9.06f)
                curveToRelative(-0.03f, 1.12f, 0.04f, 1.2f, 0.27f, 1.29f)
                curveToRelative(1.06f, 0.42f, 1.74f, 1.4f, 1.74f, 2.49f)
                close()
                moveTo(17f, 2f)
                curveToRelative(-1.42f, 0f, -3f, 2.67f, -3f, 6.5f)
                reflectiveCurveToRelative(1.58f, 6.5f, 3f, 6.5f)
                reflectiveCurveToRelative(3f, -2.67f, 3f, -6.5f)
                reflectiveCurveToRelative(-1.58f, -6.5f, -3f, -6.5f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(8.74f)
                curveToRelative(-1.0f, -1.45f, -1.66f, -3.57f, -1.74f, -6f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.07f)
                curveToRelative(0.2f, -2.01f, 0.81f, -3.75f, 1.67f, -5f)
                lineTo(5f, 2f)
                curveToRelative(-1.23f, 0f, -2.57f, 1.99f, -2.92f, 5f)
                horizontalLineToRelative(0.92f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.99f)
                curveToRelative(0.13f, 3.56f, 1.63f, 6f, 2.99f, 6f)
                close()
                moveTo(22f, 21.35f)
                curveToRelative(0f, -0.32f, -0.25f, -0.54f, -0.48f, -0.63f)
                curveToRelative(-1.59f, -0.64f, -1.55f, -2.12f, -1.52f, -3.2f)
                curveToRelative(0.0f, -0.17f, 0.01f, -2.17f, 0.01f, -2.17f)
                curveToRelative(-0.83f, 1.04f, -1.86f, 1.66f, -3f, 1.66f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8.35f)
                curveToRelative(0.36f, 0f, 0.65f, -0.29f, 0.65f, -0.65f)
                close()
            }
        }.also { _ToiletPaperUnder = it}
