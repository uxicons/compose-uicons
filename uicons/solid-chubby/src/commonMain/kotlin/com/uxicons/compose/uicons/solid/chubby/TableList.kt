package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Sc.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.93f, 14f)
                horizontalLineToRelative(-13.93f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(13.93f)
                curveToRelative(0.04f, 0.65f, 0.07f, 1.32f, 0.07f, 2f)
                reflectiveCurveToRelative(-0.03f, 1.35f, -0.07f, 2f)
                close()
                moveTo(9f, 16f)
                verticalLineToRelative(5.91f)
                curveToRelative(0.9f, 0.05f, 1.9f, 0.09f, 3f, 0.09f)
                curveToRelative(6.09f, 0f, 9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.37f, 0.65f, -0.71f)
                curveToRelative(0.03f, -0.11f, 0.46f, -1.88f, 0.76f, -4.24f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(13.73f)
                curveToRelative(-0.3f, -2.36f, -0.73f, -4.13f, -0.76f, -4.24f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.71f)
                curveToRelative(-0.13f, -0.04f, -3.22f, -1.05f, -9.32f, -1.05f)
                curveToRelative(-1.1f, 0f, -2.1f, 0.03f, -3f, 0.09f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(-5.93f)
                curveToRelative(-0.04f, 0.65f, -0.07f, 1.32f, -0.07f, 2f)
                reflectiveCurveToRelative(0.03f, 1.35f, 0.07f, 2f)
                horizontalLineToRelative(5.93f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(-5.73f)
                curveToRelative(0.3f, 2.36f, 0.73f, 4.13f, 0.76f, 4.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.09f, 0.03f, 1.53f, 0.5f, 4.32f, 0.8f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(-5.75f)
                curveToRelative(-2.79f, 0.3f, -4.23f, 0.77f, -4.32f, 0.8f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.37f, -0.65f, 0.71f)
                curveToRelative(-0.03f, 0.11f, -0.46f, 1.88f, -0.76f, 4.24f)
                close()
            }
        }.also { _TableList = it}
