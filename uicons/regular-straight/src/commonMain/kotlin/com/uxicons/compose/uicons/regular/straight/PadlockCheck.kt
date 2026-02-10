package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PadlockCheck: ImageVector? = null

val Icons.Rs.PadlockCheck: ImageVector
    get() = _PadlockCheck ?: UXIcon(name = "PadlockCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.52f, 22f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(9.35f)
                curveToRelative(1.54f, -1.25f, 3.51f, -2f, 5.65f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(3f, 3.14f, 3f, 7f)
                verticalLineToRelative(1f)
                lineTo(0f, 8f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8.35f)
                curveToRelative(-0.71f, -0.57f, -1.32f, -1.24f, -1.83f, -2f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                lineTo(5f, 8f)
                verticalLineToRelative(-1f)
                close()
                moveTo(20.99f, 16.12f)
                lineToRelative(-3.46f, 3.4f)
                curveToRelative(-0.31f, 0.31f, -0.73f, 0.48f, -1.17f, 0.48f)
                reflectiveCurveToRelative(-0.86f, -0.17f, -1.18f, -0.49f)
                lineToRelative(-1.85f, -1.79f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.23f, -3.17f)
                lineToRelative(1.4f, 1.43f)
                close()
                moveTo(17f, 10f)
                curveToRelative(-2.79f, 0f, -5.19f, 1.64f, -6.32f, 4f)
                horizontalLineToRelative(-1.69f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.08f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6f, 6.92f, 6f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _PadlockCheck = it}
