package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Washer: ImageVector? = null

val Icons.Rs.Washer: ImageVector
    get() = _Washer ?: UXIcon(name = "Washer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(6.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 10f)
                curveToRelative(2.06f, 0f, 3.74f, 1.57f, 3.96f, 3.57f)
                curveToRelative(-0.27f, 0.19f, -0.71f, 0.43f, -1.23f, 0.43f)
                curveToRelative(-0.84f, 0f, -1.83f, -0.58f, -2.14f, -0.81f)
                curveToRelative(-0.17f, -0.12f, -1.68f, -1.19f, -3.32f, -1.19f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.04f, -0.76f, 0.08f)
                curveToRelative(0.68f, -1.24f, 1.98f, -2.08f, 3.49f, -2.08f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-2.06f, 0f, -3.74f, -1.57f, -3.96f, -3.57f)
                curveToRelative(0.27f, -0.19f, 0.71f, -0.43f, 1.23f, -0.43f)
                curveToRelative(0.84f, 0f, 1.83f, 0.58f, 2.14f, 0.81f)
                curveToRelative(0.17f, 0.12f, 1.68f, 1.19f, 3.32f, 1.19f)
                curveToRelative(0.27f, 0f, 0.52f, -0.04f, 0.76f, -0.08f)
                curveToRelative(-0.68f, 1.24f, -1.98f, 2.08f, -3.49f, 2.08f)
                close()
            }
        }.also { _Washer = it}
