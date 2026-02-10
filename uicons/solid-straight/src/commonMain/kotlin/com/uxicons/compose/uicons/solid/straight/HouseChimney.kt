package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimney: ImageVector? = null

val Icons.Ss.HouseChimney: ImageVector
    get() = _HouseChimney ?: UXIcon(name = "HouseChimney") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineToRelative(-0.87f, -0.68f)
                horizontalLineToRelative(0.02f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.45f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.43f, -1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(8f)
                verticalLineTo(10.04f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
            }
        }.also { _HouseChimney = it}
