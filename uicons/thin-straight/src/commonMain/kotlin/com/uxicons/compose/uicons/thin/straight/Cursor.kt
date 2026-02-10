package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cursor: ImageVector? = null

val Icons.Ts.Cursor: ImageVector
    get() = _Cursor ?: UXIcon(name = "Cursor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.81f, 24.0f)
                lineToRelative(-5.04f, -9.51f)
                lineToRelative(-4.77f, 5.32f)
                lineTo(4f, 1.5f)
                curveToRelative(0f, -0.57f, 0.32f, -1.09f, 0.83f, -1.34f)
                curveToRelative(0.52f, -0.26f, 1.12f, -0.2f, 1.57f, 0.15f)
                lineToRelative(13.89f, 11.63f)
                lineToRelative(-7.04f, 0.34f)
                lineToRelative(5.02f, 9.48f)
                lineToRelative(-4.47f, 2.24f)
                close()
                moveTo(8.98f, 12.75f)
                lineToRelative(5.25f, 9.91f)
                lineToRelative(2.68f, -1.34f)
                lineToRelative(-5.28f, -9.97f)
                lineToRelative(6.06f, -0.29f)
                lineTo(5.79f, 1.09f)
                curveToRelative(-0.14f, -0.1f, -0.33f, -0.12f, -0.51f, -0.04f)
                curveToRelative(-0.17f, 0.09f, -0.28f, 0.25f, -0.28f, 0.45f)
                verticalLineToRelative(15.69f)
                lineToRelative(3.98f, -4.44f)
                close()
            }
        }.also { _Cursor = it}
