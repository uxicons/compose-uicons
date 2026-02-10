package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Rs.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.06f, 22f)
                horizontalLineToRelative(20.94f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(17.5f)
                curveToRelative(2.58f, -7.08f, 9.89f, -12.49f, 18f, -12.49f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-2.22f, -2.28f)
                lineToRelative(1.43f, -1.4f)
                lineToRelative(3.21f, 3.29f)
                curveToRelative(0.77f, 0.77f, 0.77f, 2.04f, -0.01f, 2.82f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.27f, -2.27f)
                horizontalLineToRelative(-1.02f)
                curveTo(11.3f, 7f, 3.65f, 13.9f, 3.06f, 22f)
                close()
            }
        }.also { _GraphCurve = it}
