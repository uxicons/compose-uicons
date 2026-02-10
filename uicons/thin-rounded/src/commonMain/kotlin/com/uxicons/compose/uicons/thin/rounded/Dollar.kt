package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Tr.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.16f, 12.22f)
                lineToRelative(-2.66f, -0.61f)
                lineTo(12.5f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.54f)
                curveToRelative(-2.73f, 0f, -4.96f, 2.22f, -4.96f, 4.96f)
                curveToRelative(0f, 2.32f, 1.58f, 4.31f, 3.84f, 4.83f)
                lineToRelative(2.66f, 0.61f)
                verticalLineToRelative(8.6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.54f)
                curveToRelative(2.73f, 0f, 4.96f, -2.22f, 4.96f, -4.96f)
                curveToRelative(0f, -2.32f, -1.58f, -4.31f, -3.84f, -4.83f)
                close()
                moveTo(9.07f, 10.81f)
                curveToRelative(-1.81f, -0.42f, -3.07f, -2.0f, -3.07f, -3.85f)
                curveToRelative(0f, -2.18f, 1.77f, -3.96f, 3.96f, -3.96f)
                horizontalLineToRelative(1.54f)
                verticalLineToRelative(8.37f)
                lineToRelative(-2.43f, -0.56f)
                close()
                moveTo(14.04f, 21f)
                horizontalLineToRelative(-1.54f)
                verticalLineToRelative(-8.37f)
                lineToRelative(2.43f, 0.56f)
                curveToRelative(1.81f, 0.42f, 3.07f, 2.0f, 3.07f, 3.85f)
                curveToRelative(0f, 2.18f, -1.77f, 3.96f, -3.96f, 3.96f)
                close()
            }
        }.also { _Dollar = it}
