package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoveToFolder: ImageVector? = null

val Icons.Sr.MoveToFolder: ImageVector
    get() = _MoveToFolder ?: UXIcon(name = "MoveToFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-1f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.11f, 0.45f, 0.11f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(15.52f, 19.71f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(0.58f, -0.58f, 0.87f, -1.34f, 0.87f, -2.09f)
                reflectiveCurveToRelative(-0.29f, -1.52f, -0.87f, -2.09f)
                lineToRelative(-1.61f, -1.61f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.29f, 1.29f)
                lineTo(7f, 15.01f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(15.4f, 17.01f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                close()
            }
        }.also { _MoveToFolder = it}
