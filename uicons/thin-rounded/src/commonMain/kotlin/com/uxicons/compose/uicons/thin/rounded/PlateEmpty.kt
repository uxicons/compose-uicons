package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Tr.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.95f, 19.0f)
                horizontalLineToRelative(-3.89f)
                curveToRelative(-2.33f, 0f, -4.58f, -0.94f, -6.17f, -2.58f)
                curveTo(2.15f, 14.63f, 0.86f, 12.36f, 0.15f, 9.83f)
                curveToRelative(-0.72f, -2.28f, 1.08f, -4.88f, 3.49f, -4.83f)
                horizontalLineTo(20.36f)
                curveToRelative(2.41f, -0.06f, 4.21f, 2.55f, 3.49f, 4.83f)
                curveToRelative(-0.71f, 2.53f, -2.0f, 4.81f, -3.73f, 6.59f)
                curveToRelative(-1.59f, 1.64f, -3.84f, 2.58f, -6.17f, 2.58f)
                close()
                moveTo(3.64f, 6f)
                curveToRelative(-1.77f, -0.04f, -3.06f, 1.9f, -2.53f, 3.56f)
                curveToRelative(0.66f, 2.33f, 1.9f, 4.52f, 3.49f, 6.17f)
                curveToRelative(1.4f, 1.45f, 3.39f, 2.28f, 5.46f, 2.28f)
                horizontalLineToRelative(3.89f)
                curveToRelative(2.06f, 0f, 4.05f, -0.83f, 5.46f, -2.28f)
                curveToRelative(1.59f, -1.64f, 2.83f, -3.83f, 3.49f, -6.17f)
                curveToRelative(0.53f, -1.66f, -0.76f, -3.6f, -2.53f, -3.56f)
                horizontalLineTo(3.64f)
                close()
            }
        }.also { _PlateEmpty = it}
