package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Sr.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 24f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.41f, 0.99f, -4.89f, 2.51f, -6.32f)
                curveToRelative(1.01f, -0.99f, 2.78f, -0.87f, 3.69f, 0.2f)
                lineToRelative(2.79f, 3.52f)
                lineToRelative(2.77f, -3.47f)
                curveToRelative(0.95f, -1.11f, 2.68f, -1.23f, 3.73f, -0.23f)
                curveToRelative(1.52f, 1.42f, 2.5f, 3.9f, 2.5f, 6.31f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(13.29f, 11.86f)
                curveToRelative(-3.87f, 0.81f, -7.29f, -2.13f, -7.29f, -5.86f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.96f, 0f, 3.74f, -0.85f, 4.99f, -2.23f)
                curveToRelative(0.49f, -0.54f, 0.26f, -1.43f, -0.45f, -1.62f)
                curveToRelative(-0.01f, -0.0f, -0.01f, -0.0f, -0.02f, -0.01f)
                curveToRelative(-0.36f, -0.09f, -0.75f, -0.01f, -1f, 0.27f)
                curveToRelative(-0.88f, 0.98f, -2.14f, 1.58f, -3.52f, 1.58f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.83f, -2.33f, 3.04f, -4.0f, 5.65f, -4.0f)
                curveToRelative(3.73f, 0f, 6.68f, 3.42f, 5.86f, 7.29f)
                curveToRelative(-0.48f, 2.27f, -2.31f, 4.1f, -4.57f, 4.57f)
                close()
            }
        }.also { _UserVneckHair = it}
