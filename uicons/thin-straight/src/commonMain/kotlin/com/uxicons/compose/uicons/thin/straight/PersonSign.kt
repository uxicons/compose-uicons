package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSign: ImageVector? = null

val Icons.Ts.PersonSign: ImageVector
    get() = _PersonSign ?: UXIcon(name = "PersonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.88f, 0f, 5.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(5.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23f, 0f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5.74f)
                lineToRelative(-2.46f, -3.51f)
                curveToRelative(-0.65f, -0.94f, -1.73f, -1.49f, -2.87f, -1.49f)
                horizontalLineToRelative(-3.44f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7f)
                lineTo(2f, 16f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.44f)
                curveToRelative(0.81f, 0f, 1.58f, 0.4f, 2.05f, 1.07f)
                lineToRelative(2.75f, 3.93f)
                horizontalLineToRelative(7.26f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                lineTo(23f, 0f)
                close()
                moveTo(22f, 6f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _PersonSign = it}
