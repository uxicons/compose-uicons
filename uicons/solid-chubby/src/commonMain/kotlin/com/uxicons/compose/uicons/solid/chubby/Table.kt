package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Sc.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 14f)
                horizontalLineToRelative(-9.93f)
                curveToRelative(-0.04f, -0.65f, -0.07f, -1.32f, -0.07f, -2f)
                curveToRelative(0f, -1.02f, 0.06f, -2.04f, 0.16f, -3f)
                horizontalLineToRelative(9.84f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -1.02f, -0.06f, -2.04f, -0.16f, -3f)
                horizontalLineToRelative(-9.84f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(9.93f)
                curveToRelative(0.04f, -0.65f, 0.07f, -1.32f, 0.07f, -2f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(-9.73f)
                curveToRelative(0.3f, 2.36f, 0.73f, 4.13f, 0.76f, 4.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.12f, 0.04f, 2.89f, 0.94f, 8.32f, 1.04f)
                close()
                moveTo(13f, 16f)
                verticalLineToRelative(5.99f)
                curveToRelative(5.43f, -0.1f, 8.2f, -1f, 8.32f, -1.04f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.38f, 0.65f, -0.71f)
                curveToRelative(0.03f, -0.11f, 0.46f, -1.88f, 0.76f, -4.24f)
                close()
                moveTo(22.59f, 7f)
                curveToRelative(-0.28f, -1.85f, -0.6f, -3.15f, -0.62f, -3.24f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.71f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.38f, -0.65f, 0.71f)
                curveToRelative(-0.02f, 0.1f, -0.34f, 1.4f, -0.62f, 3.24f)
                close()
            }
        }.also { _Table = it}
