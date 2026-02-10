package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Rc.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 2.5f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-1.99f, 0f, -4f, 1.55f, -4f, 5.01f)
                curveToRelative(0f, 10.31f, -2.46f, 12.1f, -2.45f, 12.1f)
                curveToRelative(-0.41f, 0.21f, -0.63f, 0.67f, -0.53f, 1.12f)
                curveToRelative(0.11f, 0.45f, 0.51f, 0.77f, 0.97f, 0.77f)
                horizontalLineToRelative(9.08f)
                curveToRelative(2.74f, 0f, 4.63f, -1.57f, 5.18f, -4.3f)
                curveToRelative(0.12f, -0.58f, 0.17f, -1.35f, 0.17f, -2.2f)
                horizontalLineToRelative(2.07f)
                curveToRelative(2.52f, 0f, 4.5f, -2.74f, 4.5f, -6.24f)
                reflectiveCurveToRelative(-1.98f, -6.26f, -4.5f, -6.26f)
                close()
                moveTo(14.3f, 16.81f)
                curveToRelative(-0.36f, 1.79f, -1.44f, 2.69f, -3.22f, 2.69f)
                horizontalLineToRelative(-7.02f)
                curveToRelative(0.95f, -1.82f, 1.94f, -5.33f, 1.94f, -11.99f)
                curveToRelative(0f, -1.88f, 0.75f, -3.01f, 2f, -3.01f)
                horizontalLineToRelative(7.17f)
                curveToRelative(-0.73f, 1.11f, -1.18f, 2.6f, -1.18f, 4.26f)
                curveToRelative(0f, 0.71f, 0.08f, 1.4f, 0.23f, 2.03f)
                curveToRelative(0.24f, 2.82f, 0.26f, 5.01f, 0.06f, 6.01f)
                close()
                moveTo(18.5f, 13f)
                curveToRelative(-1.35f, 0f, -2.5f, -1.94f, -2.5f, -4.24f)
                curveToRelative(0f, -2.27f, 1.17f, -4.26f, 2.5f, -4.26f)
                reflectiveCurveToRelative(2.5f, 1.99f, 2.5f, 4.26f)
                curveToRelative(0f, 2.3f, -1.15f, 4.24f, -2.5f, 4.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 8.75f)
                arcToRelative(1f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
