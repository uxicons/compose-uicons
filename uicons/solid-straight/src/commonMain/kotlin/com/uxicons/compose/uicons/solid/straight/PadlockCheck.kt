package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PadlockCheck: ImageVector? = null

val Icons.Ss.PadlockCheck: ImageVector
    get() = _PadlockCheck ?: UXIcon(name = "PadlockCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(3f, 3.14f, 3f, 7f)
                verticalLineToRelative(1f)
                lineTo(0f, 8f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9.73f)
                curveToRelative(-1.67f, -1.47f, -2.73f, -3.61f, -2.73f, -6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.09f)
                curveToRelative(1.39f, -2.39f, 3.96f, -4f, 6.91f, -4f)
                curveToRelative(0.69f, 0f, 1.36f, 0.1f, 2f, 0.26f)
                verticalLineToRelative(-2.26f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 8f)
                lineTo(5f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.62f, 3.62f)
                close()
            }
        }.also { _PadlockCheck = it}
