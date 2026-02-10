package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Split: ImageVector? = null

val Icons.Ts.Split: ImageVector
    get() = _Split ?: UXIcon(name = "Split") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 17.44f)
                lineToRelative(-4.42f, -4.5f)
                lineToRelative(-0.71f, 0.7f)
                lineToRelative(4.28f, 4.36f)
                horizontalLineTo(14.38f)
                curveToRelative(-0.42f, 0f, -0.82f, -0.18f, -1.1f, -0.48f)
                lineToRelative(-5.09f, -5.52f)
                lineToRelative(5.09f, -5.52f)
                curveToRelative(0.28f, -0.31f, 0.69f, -0.48f, 1.1f, -0.48f)
                horizontalLineToRelative(8.33f)
                lineToRelative(-4.28f, 4.36f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(4.42f, -4.5f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                lineTo(19.14f, 0.02f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.27f, 4.27f)
                horizontalLineTo(14.38f)
                curveToRelative(-0.7f, 0f, -1.37f, 0.29f, -1.84f, 0.8f)
                lineToRelative(-5.26f, 5.7f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(7.28f)
                lineToRelative(5.26f, 5.7f)
                curveToRelative(0.47f, 0.51f, 1.14f, 0.8f, 1.84f, 0.8f)
                horizontalLineToRelative(8.33f)
                lineToRelative(-4.27f, 4.27f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.42f, -4.42f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _Split = it}
