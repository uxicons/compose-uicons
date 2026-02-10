package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashUndo: ImageVector? = null

val Icons.Sr.TrashUndo: ImageVector
    get() = _TrashUndo ?: UXIcon(name = "TrashUndo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 4f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                lineTo(2f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.86f)
                lineToRelative(1.3f, 13.48f)
                curveToRelative(0.25f, 2.58f, 2.39f, 4.52f, 4.98f, 4.52f)
                horizontalLineToRelative(5.73f)
                curveToRelative(2.59f, 0f, 4.73f, -1.95f, 4.98f, -4.53f)
                lineToRelative(1.28f, -13.47f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(-7.66f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.61f, -1.61f)
                curveToRelative(-1.15f, -1.15f, -1.15f, -3.03f, 0f, -4.19f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.29f, 1.29f)
                horizontalLineToRelative(1.9f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TrashUndo = it}
