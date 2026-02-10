package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableColumns: ImageVector? = null

val Icons.Rc.TableColumns: ImageVector
    get() = _TableColumns ?: UXIcon(name = "TableColumns") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 3.76f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.71f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.37f, -0.65f, 0.71f)
                curveToRelative(-0.04f, 0.17f, -1.03f, 4.17f, -1.03f, 8.24f)
                reflectiveCurveToRelative(0.99f, 8.07f, 1.03f, 8.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.13f, 0.04f, 3.23f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.37f, 0.65f, -0.71f)
                curveToRelative(0.04f, -0.17f, 1.03f, -4.17f, 1.03f, -8.24f)
                reflectiveCurveToRelative(-0.99f, -8.07f, -1.03f, -8.24f)
                close()
                moveTo(12f, 4f)
                curveToRelative(4.34f, 0f, 7.08f, 0.54f, 8.16f, 0.81f)
                curveToRelative(0.1f, 0.48f, 0.26f, 1.26f, 0.41f, 2.19f)
                horizontalLineToRelative(-17.13f)
                curveToRelative(0.15f, -0.94f, 0.3f, -1.71f, 0.41f, -2.19f)
                curveToRelative(1.08f, -0.27f, 3.82f, -0.81f, 8.16f, -0.81f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.02f, 0.07f, -2.04f, 0.17f, -3f)
                horizontalLineToRelative(7.83f)
                verticalLineToRelative(10.98f)
                curveToRelative(-3.76f, -0.07f, -6.17f, -0.55f, -7.16f, -0.79f)
                curveToRelative(-0.26f, -1.22f, -0.84f, -4.22f, -0.84f, -7.19f)
                close()
                moveTo(13f, 19.98f)
                verticalLineToRelative(-10.98f)
                horizontalLineToRelative(7.83f)
                curveToRelative(0.1f, 0.96f, 0.17f, 1.98f, 0.17f, 3f)
                curveToRelative(0f, 2.97f, -0.58f, 5.98f, -0.84f, 7.19f)
                curveToRelative(-0.99f, 0.24f, -3.4f, 0.71f, -7.16f, 0.79f)
                close()
            }
        }.also { _TableColumns = it}
