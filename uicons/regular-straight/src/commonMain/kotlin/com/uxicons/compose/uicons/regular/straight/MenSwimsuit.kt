package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Rs.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                verticalLineToRelative(8.39f)
                lineToRelative(8.25f, 8.9f)
                curveToRelative(0.42f, 0.19f, 1.26f, 0.67f, 3.75f, 0.71f)
                curveToRelative(2.5f, -0.04f, 3.33f, -0.52f, 3.75f, -0.71f)
                lineToRelative(8.25f, -8.9f)
                verticalLineToRelative(-8.39f)
                close()
                moveTo(2f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5.17f)
                curveToRelative(-1.17f, -0.62f, -2.51f, -1.01f, -4f, -1.13f)
                verticalLineToRelative(-4.04f)
                close()
                moveTo(2.47f, 11.12f)
                curveToRelative(3.55f, 0.53f, 5.87f, 3.04f, 6.38f, 6.88f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.4f, 0f, -0.75f, -0.03f, -1.06f, -0.06f)
                curveToRelative(-0.14f, -3.06f, -1.19f, -5.55f, -2.94f, -7.28f)
                verticalLineToRelative(-6.66f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.66f)
                curveToRelative(-1.75f, 1.73f, -2.79f, 4.22f, -2.94f, 7.28f)
                curveToRelative(-0.31f, 0.03f, -0.66f, 0.06f, -1.06f, 0.06f)
                close()
                moveTo(15.15f, 18.0f)
                curveToRelative(0.51f, -3.85f, 2.83f, -6.35f, 6.38f, -6.88f)
                close()
                moveTo(22f, 9.04f)
                curveToRelative(-1.49f, 0.12f, -2.83f, 0.5f, -4f, 1.13f)
                verticalLineToRelative(-5.17f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.04f)
                close()
            }
        }.also { _MenSwimsuit = it}
