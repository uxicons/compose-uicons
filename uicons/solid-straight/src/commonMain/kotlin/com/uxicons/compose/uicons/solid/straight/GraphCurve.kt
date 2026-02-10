package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Ss.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7f)
                horizontalLineToRelative(1.02f)
                lineToRelative(-2.27f, 2.27f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.25f, -3.25f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.01f, -2.82f)
                lineToRelative(-3.21f, -3.29f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.22f, 2.28f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-8.11f, 0f, -15.42f, 5.41f, -18f, 12.49f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3.06f)
                curveToRelative(0.59f, -8.1f, 8.24f, -15f, 16.94f, -15f)
                close()
            }
        }.also { _GraphCurve = it}
