package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertSquare: ImageVector? = null

val Icons.Sr.InsertSquare: ImageVector
    get() = _InsertSquare ?: UXIcon(name = "InsertSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.7f, 9.79f)
                curveToRelative(0.4f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                lineToRelative(-3.3f, -3.23f)
                verticalLineToRelative(15.02f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 7.99f)
                lineToRelative(-3.3f, 3.22f)
                curveToRelative(-0.4f, 0.39f, -1.03f, 0.38f, -1.41f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -0.38f, -1.03f, 0.01f, -1.41f)
                lineToRelative(4.29f, -4.21f)
                curveToRelative(0.77f, -0.77f, 2.04f, -0.77f, 2.82f, 0.01f)
                lineToRelative(4.29f, 4.2f)
                close()
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _InsertSquare = it}
