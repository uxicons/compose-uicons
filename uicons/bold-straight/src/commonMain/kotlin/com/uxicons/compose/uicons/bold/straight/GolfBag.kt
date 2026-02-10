package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBag: ImageVector? = null

val Icons.Bs.GolfBag: ImageVector
    get() = _GolfBag ?: UXIcon(name = "GolfBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-5.4f)
                lineToRelative(0.42f, -3f)
                horizontalLineToRelative(1.56f)
                curveToRelative(1.71f, 0f, 2.91f, -0.92f, 2.91f, -0.92f)
                curveToRelative(-0.24f, -1.69f, -1.56f, -3.1f, -3.33f, -3.08f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(-1.32f, 0f, -2.48f, 0.78f, -3f, 1.96f)
                curveToRelative(-0.12f, 0.28f, -0.19f, 0.57f, -0.23f, 0.88f)
                lineToRelative(-0.6f, 4.17f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-0.46f, -3.17f)
                curveToRelative(-0.04f, -0.3f, -0.11f, -0.6f, -0.23f, -0.88f)
                curveToRelative(-0.52f, -1.17f, -1.68f, -1.96f, -3f, -1.96f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(-1.77f, -0.02f, -3.09f, 1.39f, -3.33f, 3.08f)
                curveToRelative(0f, 0f, 1.2f, 0.92f, 2.91f, 0.92f)
                horizontalLineToRelative(1.56f)
                lineToRelative(0.28f, 2f)
                horizontalLineToRelative(-2.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(8f)
                curveToRelative(1.66f, 0f, 3.05f, -1.17f, 3.41f, -2.72f)
                curveToRelative(1.83f, -1.6f, 5.09f, -5.22f, 5.09f, -10.78f)
                close()
                moveTo(19.5f, 10f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                curveToRelative(0f, 2.62f, -0.94f, 4.7f, -2f, 6.22f)
                verticalLineToRelative(-6.72f)
                close()
                moveTo(15f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                close()
            }
        }.also { _GolfBag = it}
