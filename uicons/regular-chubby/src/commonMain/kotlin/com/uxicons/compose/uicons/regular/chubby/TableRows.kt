package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Rc.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 3.76f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.71f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.37f, -0.65f, 0.71f)
                curveToRelative(-0.04f, 0.17f, -1.03f, 4.17f, -1.03f, 8.24f)
                reflectiveCurveToRelative(0.99f, 8.07f, 1.03f, 8.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.13f, 0.04f, 3.22f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.37f, 0.65f, -0.71f)
                curveToRelative(0.04f, -0.17f, 1.03f, -4.17f, 1.03f, -8.24f)
                reflectiveCurveToRelative(-0.99f, -8.07f, -1.03f, -8.24f)
                close()
                moveTo(20.16f, 4.81f)
                curveToRelative(0.23f, 1.08f, 0.71f, 3.57f, 0.82f, 6.19f)
                horizontalLineToRelative(-12.98f)
                verticalLineToRelative(-6.83f)
                curveToRelative(1.13f, -0.1f, 2.46f, -0.17f, 4f, -0.17f)
                curveToRelative(4.34f, 0f, 7.08f, 0.54f, 8.16f, 0.81f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.97f, 0.58f, -5.98f, 0.84f, -7.19f)
                curveToRelative(0.44f, -0.11f, 1.17f, -0.26f, 2.16f, -0.41f)
                verticalLineToRelative(15.2f)
                curveToRelative(-0.99f, -0.14f, -1.72f, -0.3f, -2.16f, -0.41f)
                curveToRelative(-0.26f, -1.22f, -0.84f, -4.22f, -0.84f, -7.19f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-1.54f, 0f, -2.87f, -0.07f, -4f, -0.17f)
                verticalLineToRelative(-6.83f)
                horizontalLineToRelative(12.98f)
                curveToRelative(-0.1f, 2.62f, -0.58f, 5.11f, -0.82f, 6.19f)
                curveToRelative(-1.08f, 0.27f, -3.82f, 0.81f, -8.16f, 0.81f)
                close()
            }
        }.also { _TableRows = it}
