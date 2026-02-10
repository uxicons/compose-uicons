package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PickingBox: ImageVector? = null

val Icons.Ss.PickingBox: ImageVector
    get() = _PickingBox ?: UXIcon(name = "PickingBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.95f, 17f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(-1.13f, 0f, -2.05f, 0.92f, -2.05f, 2.05f)
                verticalLineToRelative(4.91f)
                curveToRelative(0f, 0.03f, 0.02f, 0.05f, 0.05f, 0.05f)
                horizontalLineToRelative(8.91f)
                curveToRelative(0.03f, 0f, 0.05f, -0.02f, 0.05f, -0.05f)
                verticalLineToRelative(-4.91f)
                curveToRelative(0f, -1.13f, -0.92f, -2.05f, -2.05f, -2.05f)
                close()
                moveTo(11.95f, 21f)
                horizontalLineToRelative(-2.91f)
                curveToRelative(-0.03f, 0f, -0.05f, -0.02f, -0.05f, -0.05f)
                verticalLineToRelative(-1.91f)
                curveToRelative(0f, -0.03f, 0.02f, -0.05f, 0.05f, -0.05f)
                horizontalLineToRelative(2.91f)
                curveToRelative(0.03f, 0f, 0.05f, 0.02f, 0.05f, 0.05f)
                verticalLineToRelative(1.91f)
                curveToRelative(0f, 0.03f, -0.02f, 0.05f, -0.05f, 0.05f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-4.47f)
                curveToRelative(-0.02f, 0f, -0.03f, 0.0f, -0.04f, 0.02f)
                curveToRelative(-0.12f, 0.2f, -1.14f, 2.01f, -1.33f, 2.34f)
                curveToRelative(-1.14f, 1.91f, -3.08f, 3.11f, -3.38f, 3.29f)
                curveToRelative(-0.39f, 0.23f, -0.83f, 0.35f, -1.28f, 0.35f)
                curveToRelative(-1.45f, 0f, -2.76f, -1.28f, -2.46f, -3.01f)
                curveToRelative(0.12f, -0.71f, 0.62f, -1.29f, 1.23f, -1.67f)
                curveToRelative(0.88f, -0.55f, 1.73f, -1.34f, 1.73f, -2.32f)
                curveToRelative(0f, -1.2f, -1.07f, -2.16f, -2.3f, -1.98f)
                curveToRelative(-1.01f, 0.15f, -1.7f, 1.11f, -1.7f, 2.13f)
                verticalLineToRelative(5.99f)
                curveToRelative(0f, 1.2f, -1.06f, 2.16f, -2.3f, 1.98f)
                curveToRelative(-1.01f, -0.15f, -1.7f, -1.1f, -1.7f, -2.12f)
                verticalLineToRelative(-7.95f)
                curveToRelative(0f, -3.34f, 2.71f, -6.05f, 6.05f, -6.05f)
                horizontalLineToRelative(11.95f)
                verticalLineToRelative(9f)
                close()
                moveTo(4f, 13.73f)
                curveToRelative(-0.72f, 0.41f, -1.67f, 0.36f, -2.35f, -0.26f)
                curveToRelative(-0.75f, -0.69f, -0.79f, -1.87f, -0.22f, -2.71f)
                lineToRelative(2.57f, -3.8f)
                verticalLineToRelative(6.77f)
                close()
                moveTo(4f, 6.75f)
                lineToRelative(-1.18f, 0.53f)
                curveToRelative(-1.09f, 0.5f, -2.4f, -0.07f, -2.75f, -1.27f)
                curveToRelative(-0.28f, -0.98f, 0.3f, -2.0f, 1.23f, -2.43f)
                lineToRelative(3.93f, -1.78f)
                curveToRelative(-0.77f, 1.24f, -1.23f, 2.69f, -1.23f, 4.25f)
                verticalLineToRelative(0.7f)
                close()
            }
        }.also { _PickingBox = it}
