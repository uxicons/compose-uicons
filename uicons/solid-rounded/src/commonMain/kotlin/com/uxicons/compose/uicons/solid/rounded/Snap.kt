package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snap: ImageVector? = null

val Icons.Sr.Snap: ImageVector
    get() = _Snap ?: UXIcon(name = "Snap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.29f, 5.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2f, -2f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(5.29f, 5.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2f, 2f)
                close()
                moveTo(21.66f, 4.82f)
                curveToRelative(-0.72f, -1.0f, -2.13f, -1.09f, -2.97f, -0.25f)
                lineToRelative(-9.69f, 9.43f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(9.26f)
                curveToRelative(0f, 0.8f, -0.29f, 1.56f, -0.85f, 2.12f)
                lineToRelative(-2.62f, 2.62f)
                horizontalLineToRelative(16.48f)
                curveToRelative(1.5f, 0f, 1.74f, -0.56f, 1.74f, -0.56f)
                curveToRelative(1.45f, -1.45f, 1.68f, -3.73f, 0.54f, -5.44f)
                lineToRelative(-3.65f, -5.85f)
                lineToRelative(4.75f, -4.75f)
                curveToRelative(0.69f, -0.69f, 0.85f, -1.79f, 0.29f, -2.58f)
                close()
            }
        }.also { _Snap = it}
