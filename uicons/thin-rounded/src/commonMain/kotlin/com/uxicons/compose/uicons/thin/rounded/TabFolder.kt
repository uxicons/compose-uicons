package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Tr.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.35f, 4.08f)
                lineToRelative(-0.85f, -1.7f)
                curveToRelative(-0.43f, -0.85f, -1.28f, -1.38f, -2.24f, -1.38f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.57f, 0f, 1.09f, 0.32f, 1.34f, 0.83f)
                lineToRelative(0.58f, 1.17f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(-0.81f, -1.62f)
                curveToRelative(-0.43f, -0.85f, -1.28f, -1.38f, -2.24f, -1.38f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.57f, 0f, 1.08f, 0.32f, 1.34f, 0.83f)
                lineToRelative(0.58f, 1.17f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(-1.08f, -2.17f)
                curveToRelative(-0.26f, -0.51f, -0.77f, -0.83f, -1.34f, -0.83f)
                horizontalLineToRelative(-1.38f)
                curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.19f, -1.57f, -4.02f, -3.65f, -4.42f)
                close()
                moveTo(4.5f, 2f)
                horizontalLineToRelative(1.38f)
                curveToRelative(0.19f, 0f, 0.36f, 0.1f, 0.45f, 0.28f)
                lineToRelative(1.22f, 2.45f)
                curveToRelative(0.09f, 0.17f, 0.26f, 0.28f, 0.45f, 0.28f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(1f, 8.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 22f)
                lineTo(4.5f, 22f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _TabFolder = it}
