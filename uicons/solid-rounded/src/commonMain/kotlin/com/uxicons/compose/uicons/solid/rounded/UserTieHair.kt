package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHair: ImageVector? = null

val Icons.Sr.UserTieHair: ImageVector
    get() = _UserTieHair ?: UXIcon(name = "UserTieHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.29f, 11.86f)
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
                moveTo(14.71f, 14.42f)
                lineTo(12.87f, 17.19f)
                lineTo(14.73f, 24f)
                horizontalLineToRelative(5.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.02f, -2.65f, -7.43f, -6.29f, -8.58f)
                close()
                moveTo(11.13f, 17.19f)
                lineTo(9.29f, 14.42f)
                curveToRelative(-3.64f, 1.15f, -6.29f, 4.56f, -6.29f, 8.58f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.27f)
                close()
            }
        }.also { _UserTieHair = it}
