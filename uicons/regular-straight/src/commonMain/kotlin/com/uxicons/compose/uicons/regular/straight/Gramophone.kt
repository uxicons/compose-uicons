package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Rs.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3.32f)
                curveToRelative(-0.84f, -0.17f, -7.82f, -1.69f, -10.69f, -5.59f)
                lineToRelative(-0.3f, -0.41f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.7f)
                lineToRelative(0.3f, -0.41f)
                curveToRelative(2.86f, -3.89f, 9.83f, -5.42f, 10.69f, -5.59f)
                horizontalLineToRelative(3.32f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(5f, 17f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 10.67f)
                lineTo(6f, 3.33f)
                curveToRelative(2.04f, 1.78f, 4.68f, 2.95f, 6.8f, 3.67f)
                curveToRelative(-2.12f, 0.72f, -4.76f, 1.9f, -6.8f, 3.67f)
                close()
                moveTo(4f, 20f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                lineTo(4f, 22f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Gramophone = it}
