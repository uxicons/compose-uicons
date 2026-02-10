package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniformMartialArts: ImageVector? = null

val Icons.Ss.UniformMartialArts: ImageVector
    get() = _UniformMartialArts ?: UXIcon(name = "UniformMartialArts") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.42f, 0f)
                lineToRelative(-3.39f, 6.03f)
                lineTo(8.58f, 0f)
                horizontalLineToRelative(6.83f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.98f)
                lineToRelative(3.9f, -6.94f)
                lineTo(6.37f, 0.16f)
                curveToRelative(-1.95f, 0.35f, -3.59f, 1.24f, -4.7f, 2.02f)
                curveToRelative(-1.04f, 0.73f, -1.66f, 1.95f, -1.66f, 3.25f)
                verticalLineToRelative(15.58f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                close()
                moveTo(22.34f, 2.18f)
                curveToRelative(-1.12f, -0.78f, -2.76f, -1.68f, -4.71f, -2.02f)
                lineTo(9.27f, 15f)
                horizontalLineToRelative(9.73f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                verticalLineTo(5.42f)
                curveToRelative(0f, -1.3f, -0.62f, -2.51f, -1.66f, -3.25f)
                close()
                moveTo(5f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(0.51f, 0.83f, 0.97f, 1.89f, 0.97f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.51f, -1.75f, -1f, -2.44f)
                curveToRelative(-0.49f, 0.68f, -1f, 1.61f, -1f, 2.44f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.11f, 0.46f, -2.17f, 0.97f, -3f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _UniformMartialArts = it}
