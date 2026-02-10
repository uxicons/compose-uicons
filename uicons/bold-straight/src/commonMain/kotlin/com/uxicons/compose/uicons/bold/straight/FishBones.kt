package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishBones: ImageVector? = null

val Icons.Bs.FishBones: ImageVector
    get() = _FishBones ?: UXIcon(name = "FishBones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.14f, 3.86f)
                curveToRelative(0f, -2.86f, -2.57f, -3.86f, -3.86f, -3.86f)
                curveToRelative(-0.77f, 0f, -1.29f, 0.38f, -1.29f, 1.16f)
                verticalLineToRelative(5.72f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-1.38f, 1.38f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.94f, 2.94f)
                lineToRelative(-1.38f, 1.38f)
                lineToRelative(-4.05f, -4.05f)
                curveToRelative(-0.58f, 0.81f, -1.05f, 1.74f, -1.42f, 2.83f)
                curveToRelative(-0.72f, 2.17f, -1.03f, 4.9f, -1.03f, 8.34f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.44f, 0f, 6.18f, -0.31f, 8.34f, -1.03f)
                curveToRelative(1.08f, -0.36f, 2.02f, -0.83f, 2.83f, -1.42f)
                lineToRelative(-4.05f, -4.05f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(2.94f, 2.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(5.72f)
                curveToRelative(0.77f, 0f, 1.16f, -0.52f, 1.16f, -1.29f)
                curveToRelative(0f, -1.29f, -1.0f, -3.86f, -3.86f, -3.86f)
                close()
                moveTo(3f, 21f)
                curveToRelative(0.05f, -1.73f, 0.19f, -3.18f, 0.46f, -4.42f)
                lineToRelative(3.97f, 3.97f)
                curveToRelative(-1.25f, 0.26f, -2.7f, 0.41f, -4.42f, 0.46f)
                close()
            }
        }.also { _FishBones = it}
