package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Ss.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9.04f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.04f)
                curveToRelative(-0.95f, 0.83f, -3.5f, 3.18f, -5.24f, 5.91f)
                horizontalLineToRelative(18.06f)
                curveToRelative(0.49f, 0.65f, 0.94f, 1.33f, 1.3f, 2f)
                horizontalLineTo(0.68f)
                curveToRelative(-0.42f, 0.97f, -0.68f, 1.96f, -0.68f, 2.91f)
                curveToRelative(0f, 3.04f, 2.77f, 4.04f, 2.88f, 4.09f)
                lineToRelative(0.16f, 0.06f)
                horizontalLineToRelative(17.91f)
                lineToRelative(0.16f, -0.06f)
                curveToRelative(0.12f, -0.04f, 2.88f, -1.05f, 2.88f, -4.09f)
                curveToRelative(0f, -4.39f, -5.5f, -9.51f, -7f, -10.82f)
                close()
            }
        }.also { _Flask = it}
