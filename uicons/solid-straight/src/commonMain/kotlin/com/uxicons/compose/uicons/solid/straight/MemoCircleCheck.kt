package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoCircleCheck: ImageVector? = null

val Icons.Ss.MemoCircleCheck: ImageVector
    get() = _MemoCircleCheck ?: UXIcon(name = "MemoCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.54f, 20.52f)
                curveToRelative(-0.31f, 0.31f, -0.73f, 0.48f, -1.17f, 0.48f)
                reflectiveCurveToRelative(-0.86f, -0.17f, -1.18f, -0.49f)
                lineToRelative(-1.84f, -1.79f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.23f, -3.17f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.46f, 3.4f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -2.39f, 1.05f, -4.53f, 2.71f, -6f)
                lineTo(4f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.07f)
                curveToRelative(1.18f, -0.68f, 2.54f, -1.07f, 4f, -1.07f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(12.71f)
                curveToRelative(-1.66f, -1.47f, -2.71f, -3.61f, -2.71f, -6f)
                close()
                moveTo(4f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(4f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _MemoCircleCheck = it}
