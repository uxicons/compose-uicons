package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Tr.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 5.5f)
                curveToRelative(0.55f, 0f, 1f, 1.12f, 1f, 2.5f)
                reflectiveCurveToRelative(-0.45f, 2.5f, -1f, 2.5f)
                reflectiveCurveToRelative(-1f, -1.12f, -1f, -2.5f)
                reflectiveCurveToRelative(0.45f, -2.5f, 1f, -2.5f)
                close()
                moveTo(16.5f, 20.02f)
                curveToRelative(-0.27f, -0.07f, -0.54f, 0.09f, -0.61f, 0.36f)
                curveToRelative(-0.4f, 1.55f, -1.79f, 2.62f, -3.39f, 2.62f)
                lineTo(2.15f, 23f)
                curveToRelative(-0.64f, 0f, -1.15f, -0.52f, -1.15f, -1.15f)
                curveToRelative(0f, -0.47f, 0.31f, -0.9f, 0.8f, -1.1f)
                curveToRelative(1.34f, -0.53f, 2.2f, -1.81f, 2.2f, -3.25f)
                lineTo(4f, 7.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.03f, -0.62f, 1.94f, -1.57f, 2.32f)
                curveToRelative(-0.87f, 0.35f, -1.43f, 1.14f, -1.43f, 2.02f)
                curveToRelative(0f, 1.19f, 0.97f, 2.15f, 2.15f, 2.15f)
                horizontalLineToRelative(10.35f)
                curveToRelative(2.06f, 0f, 3.85f, -1.39f, 4.36f, -3.38f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.36f, -0.61f)
                close()
                moveTo(23.85f, 23.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.15f, 0.85f)
                curveTo(-0.05f, 0.66f, -0.05f, 0.34f, 0.15f, 0.15f)
                reflectiveCurveTo(0.66f, -0.05f, 0.85f, 0.15f)
                lineToRelative(2.92f, 2.92f)
                curveToRelative(0.83f, -1.91f, 2.22f, -3.06f, 3.73f, -3.06f)
                horizontalLineToRelative(12.5f)
                curveToRelative(2.24f, 0f, 4f, 3.51f, 4f, 8f)
                reflectiveCurveToRelative(-1.76f, 8f, -4f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.29f)
                lineToRelative(6.85f, 6.85f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(1.03f)
                curveToRelative(-0.39f, -0.43f, -0.74f, -0.99f, -1.03f, -1.66f)
                verticalLineToRelative(1.66f)
                close()
                moveTo(20.0f, 1.0f)
                curveToRelative(-1.42f, 0f, -3f, 2.88f, -3f, 7f)
                reflectiveCurveToRelative(1.58f, 7f, 3f, 7f)
                reflectiveCurveToRelative(3f, -2.88f, 3f, -7f)
                reflectiveCurveToRelative(-1.58f, -7f, -3f, -7f)
                close()
                moveTo(4.54f, 3.83f)
                lineToRelative(11.46f, 11.46f)
                verticalLineToRelative(-7.29f)
                curveToRelative(0f, -3.05f, 0.81f, -5.65f, 2.04f, -7f)
                lineTo(7.5f, 1f)
                curveToRelative(-1.19f, 0f, -2.32f, 1.08f, -2.96f, 2.83f)
                close()
            }
        }.also { _ToiletPaperSlash = it}
