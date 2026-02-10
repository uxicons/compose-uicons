package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PicpeopleFilled: ImageVector? = null

val Icons.Rc.PicpeopleFilled: ImageVector
    get() = _PicpeopleFilled ?: UXIcon(name = "PicpeopleFilled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10f)
                curveToRelative(0f, 2.69f, -1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                reflectiveCurveToRelative(1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.08f, -0.99f, 8.07f, -1.03f, 8.24f)
                curveToRelative(-0.08f, 0.33f, -0.33f, 0.6f, -0.65f, 0.71f)
                curveToRelative(-0.13f, 0.04f, -3.23f, 1.05f, -9.32f, 1.05f)
                reflectiveCurveToRelative(-9.19f, -1.01f, -9.32f, -1.05f)
                curveToRelative(-0.32f, -0.11f, -0.57f, -0.38f, -0.65f, -0.71f)
                curveToRelative(-0.04f, -0.17f, -1.03f, -4.17f, -1.03f, -8.24f)
                reflectiveCurveToRelative(0.99f, -8.07f, 1.03f, -8.24f)
                curveToRelative(0.08f, -0.33f, 0.33f, -0.6f, 0.65f, -0.71f)
                curveToRelative(0.13f, -0.04f, 3.23f, -1.05f, 9.32f, -1.05f)
                reflectiveCurveToRelative(9.19f, 1.01f, 9.32f, 1.05f)
                curveToRelative(0.32f, 0.11f, 0.57f, 0.38f, 0.65f, 0.71f)
                curveToRelative(0.04f, 0.17f, 1.03f, 4.17f, 1.03f, 8.24f)
                close()
                moveTo(20.16f, 19.19f)
                curveToRelative(0.26f, -1.22f, 0.84f, -4.23f, 0.84f, -7.19f)
                reflectiveCurveToRelative(-0.58f, -5.98f, -0.84f, -7.19f)
                curveToRelative(-1.08f, -0.27f, -3.81f, -0.81f, -8.16f, -0.81f)
                reflectiveCurveToRelative(-7.08f, 0.54f, -8.16f, 0.81f)
                curveToRelative(-0.26f, 1.22f, -0.84f, 4.23f, -0.84f, 7.19f)
                reflectiveCurveToRelative(0.58f, 5.98f, 0.84f, 7.19f)
                curveToRelative(0.4f, 0.1f, 1.03f, 0.23f, 1.88f, 0.37f)
                curveToRelative(0.72f, -2.39f, 2.23f, -3.15f, 3.44f, -3.34f)
                curveToRelative(1.86f, -0.29f, 3.8f, -0.29f, 5.68f, 0f)
                curveToRelative(1.21f, 0.19f, 2.73f, 0.95f, 3.44f, 3.34f)
                curveToRelative(0.85f, -0.13f, 1.48f, -0.27f, 1.88f, -0.37f)
                close()
            }
        }.also { _PicpeopleFilled = it}
