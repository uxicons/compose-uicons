package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PicpeopleFilled: ImageVector? = null

val Icons.Sc.PicpeopleFilled: ImageVector
    get() = _PicpeopleFilled ?: UXIcon(name = "PicpeopleFilled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 3.76f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.71f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.38f, -0.65f, 0.71f)
                curveToRelative(-0.04f, 0.17f, -1.03f, 4.17f, -1.03f, 8.24f)
                reflectiveCurveToRelative(0.99f, 8.07f, 1.03f, 8.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.13f, 0.04f, 3.23f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.38f, 0.65f, -0.71f)
                curveToRelative(0.04f, -0.17f, 1.03f, -4.17f, 1.03f, -8.24f)
                reflectiveCurveToRelative(-0.99f, -8.07f, -1.03f, -8.24f)
                close()
                moveTo(12f, 6f)
                curveToRelative(2.69f, 0f, 4f, 1.31f, 4f, 4f)
                reflectiveCurveToRelative(-1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                reflectiveCurveToRelative(1.31f, -4f, 4f, -4f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-2.74f, 0f, -4.83f, -0.22f, -6.28f, -0.44f)
                curveToRelative(0.72f, -2.39f, 2.23f, -3.15f, 3.44f, -3.34f)
                curveToRelative(1.86f, -0.29f, 3.8f, -0.29f, 5.68f, 0f)
                curveToRelative(1.21f, 0.19f, 2.73f, 0.95f, 3.44f, 3.34f)
                curveToRelative(-1.45f, 0.23f, -3.54f, 0.44f, -6.28f, 0.44f)
                close()
            }
        }.also { _PicpeopleFilled = it}
