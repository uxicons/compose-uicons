package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Bs.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.17f, 21f)
                horizontalLineToRelative(19.82f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15.14f)
                curveToRelative(3.14f, -5.94f, 9.66f, -10.14f, 17f, -10.14f)
                verticalLineToRelative(-3f)
                lineToRelative(3.7f, 3.79f)
                curveToRelative(0.41f, 0.39f, 0.41f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.7f, 3.79f)
                verticalLineToRelative(-3f)
                curveToRelative(-7.8f, 0f, -14.71f, 5.88f, -15.82f, 13f)
                close()
            }
        }.also { _GraphCurve = it}
