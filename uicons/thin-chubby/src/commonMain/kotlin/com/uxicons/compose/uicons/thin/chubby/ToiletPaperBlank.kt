package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Tc.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2.5f)
                horizontalLineToRelative(-11.2f)
                curveToRelative(-2.22f, 0f, -3.65f, 1.86f, -3.65f, 4.74f)
                curveToRelative(0f, 11.51f, -2.86f, 13.3f, -2.88f, 13.31f)
                curveToRelative(-0.21f, 0.1f, -0.32f, 0.34f, -0.26f, 0.56f)
                curveToRelative(0.05f, 0.23f, 0.26f, 0.38f, 0.49f, 0.38f)
                horizontalLineToRelative(9.54f)
                curveToRelative(2.6f, 0f, 4.38f, -1.5f, 4.9f, -4.11f)
                curveToRelative(0.1f, -0.52f, 0.15f, -1.63f, 0.16f, -2.89f)
                horizontalLineToRelative(2.91f)
                curveToRelative(2.28f, 0f, 4f, -2.58f, 4f, -6f)
                reflectiveCurveToRelative(-1.72f, -6f, -4f, -6f)
                close()
                moveTo(15.02f, 9.11f)
                curveToRelative(0.07f, 2.33f, 0.15f, 6.99f, -0.07f, 8.09f)
                curveToRelative(-0.54f, 2.73f, -2.43f, 3.3f, -3.92f, 3.3f)
                horizontalLineToRelative(-8.35f)
                curveToRelative(1.02f, -1.44f, 2.46f, -4.95f, 2.46f, -13.26f)
                curveToRelative(0f, -2.31f, 1.02f, -3.74f, 2.65f, -3.74f)
                horizontalLineToRelative(8.93f)
                curveToRelative(-1.06f, 1.06f, -1.73f, 2.87f, -1.73f, 5f)
                curveToRelative(0f, 0f, 0.01f, 0.41f, 0.02f, 0.61f)
                close()
                moveTo(16.09f, 13.5f)
                curveToRelative(0f, -0.27f, -0.0f, -0.54f, -0.0f, -0.8f)
                curveToRelative(0.19f, 0.3f, 0.41f, 0.57f, 0.64f, 0.8f)
                close()
                moveTo(19f, 13.5f)
                curveToRelative(-1.68f, 0f, -3f, -2.2f, -3f, -5f)
                reflectiveCurveToRelative(1.32f, -5f, 3f, -5f)
                reflectiveCurveToRelative(3f, 2.2f, 3f, 5f)
                reflectiveCurveToRelative(-1.32f, 5f, -3f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.25f, 8.5f)
                arcToRelative(0.75f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                arcToRelative(0.75f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
