package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarks: ImageVector? = null

val Icons.Sc.DiaryBookmarks: ImageVector
    get() = _DiaryBookmarks ?: UXIcon(name = "DiaryBookmarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13f)
                curveToRelative(1.43f, 0f, 2f, -0.57f, 2f, -2f)
                curveToRelative(0.02f, -1.47f, -0.66f, -2.04f, -2.1f, -2f)
                curveToRelative(-0.02f, -0.34f, -0.05f, -0.68f, -0.07f, -1f)
                curveToRelative(1.46f, 0f, 2.21f, -0.49f, 2.18f, -2f)
                curveToRelative(0f, -1.43f, -0.57f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-0.1f, -0.69f, -0.17f, -1.12f, -0.18f, -1.17f)
                curveToRelative(-0.07f, -0.38f, -0.35f, -0.69f, -0.72f, -0.79f)
                curveToRelative(-0.15f, -0.04f, -3.82f, -1.04f, -7.46f, -1.04f)
                curveToRelative(-1.18f, 0f, -2.19f, 0.08f, -3f, 0.17f)
                verticalLineToRelative(14.83f)
                horizontalLineToRelative(11.82f)
                curveToRelative(-0.06f, 0.71f, -0.12f, 1.39f, -0.2f, 2f)
                horizontalLineToRelative(0.37f)
                curveToRelative(1.43f, 0f, 2f, -0.57f, 2f, -2f)
                curveToRelative(0.01f, -1.45f, -0.61f, -2f, -2.05f, -2f)
                curveToRelative(0.01f, -0.33f, 0.02f, -0.67f, 0.02f, -1f)
                horizontalLineToRelative(0.02f)
                close()
                moveTo(5f, 16f)
                curveToRelative(-0.7f, 0f, -1.8f, 0.26f, -2.73f, 0.98f)
                curveToRelative(-0.14f, -1.47f, -0.27f, -3.23f, -0.27f, -4.98f)
                curveToRelative(0f, -2.48f, 0.24f, -4.98f, 0.45f, -6.65f)
                curveToRelative(0.24f, -1.93f, 1.66f, -3.45f, 3.55f, -3.85f)
                verticalLineToRelative(14.49f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(14.63f)
                curveToRelative(-0.21f, 1.81f, -0.42f, 3.08f, -0.44f, 3.17f)
                curveToRelative(-0.07f, 0.38f, -0.35f, 0.69f, -0.72f, 0.79f)
                curveToRelative(-0.15f, 0.04f, -3.82f, 1.04f, -7.46f, 1.04f)
                curveToRelative(-1.47f, 0f, -3.1f, -0.16f, -4.87f, -0.47f)
                curveToRelative(-1.6f, -0.28f, -2.87f, -1.39f, -3.42f, -2.86f)
                curveToRelative(0.56f, -1.57f, 2.1f, -1.67f, 2.29f, -1.67f)
                close()
            }
        }.also { _DiaryBookmarks = it}
