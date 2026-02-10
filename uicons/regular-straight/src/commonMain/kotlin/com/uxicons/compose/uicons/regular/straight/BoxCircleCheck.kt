package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCircleCheck: ImageVector? = null

val Icons.Rs.BoxCircleCheck: ImageVector
    get() = _BoxCircleCheck ?: UXIcon(name = "BoxCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10.34f)
                curveToRelative(-0.7f, -0.57f, -1.32f, -1.25f, -1.83f, -2f)
                lineTo(3f, 22f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(0.94f)
                curveToRelative(0.73f, 0.36f, 1.4f, 0.82f, 2f, 1.36f)
                verticalLineToRelative(-2.29f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveTo(19.59f, 14.69f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.46f, 3.4f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.48f, -1.17f, 0.48f)
                reflectiveCurveToRelative(-0.85f, -0.16f, -1.18f, -0.49f)
                lineToRelative(-1.85f, -1.79f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.23f, -3.17f)
                close()
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _BoxCircleCheck = it}
