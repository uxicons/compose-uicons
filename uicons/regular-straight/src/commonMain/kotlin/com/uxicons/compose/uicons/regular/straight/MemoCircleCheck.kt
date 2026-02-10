package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoCircleCheck: ImageVector? = null

val Icons.Rs.MemoCircleCheck: ImageVector
    get() = _MemoCircleCheck ?: UXIcon(name = "MemoCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.35f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.06f)
                lineTo(16f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(7.52f)
                curveToRelative(0.51f, 0.76f, 1.12f, 1.43f, 1.83f, 2f)
                close()
                moveTo(11.35f, 10f)
                horizontalLineToRelative(-7.35f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.52f)
                curveToRelative(0.51f, -0.76f, 1.12f, -1.43f, 1.83f, -2f)
                close()
                moveTo(4f, 17f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, -0.69f, 0.08f, -1.36f, 0.23f, -2f)
                horizontalLineToRelative(-4.23f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(14f, 5f)
                lineTo(4f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.59f, 14.69f)
                lineToRelative(-3.23f, 3.17f)
                lineToRelative(-1.63f, -1.58f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(1.84f, 1.79f)
                curveToRelative(0.31f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                reflectiveCurveToRelative(0.86f, -0.17f, 1.17f, -0.48f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-1.4f, -1.43f)
                close()
            }
        }.also { _MemoCircleCheck = it}
