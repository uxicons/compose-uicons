package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyCheck: ImageVector? = null

val Icons.Sc.MoneyCheck: ImageVector
    get() = _MoneyCheck ?: UXIcon(name = "MoneyCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 4.72f)
                curveToRelative(-0.11f, -0.29f, -0.33f, -0.51f, -0.61f, -0.61f)
                curveToRelative(-0.13f, -0.04f, -3.22f, -1.11f, -9.32f, -1.11f)
                reflectiveCurveToRelative(-9.19f, 1.07f, -9.32f, 1.11f)
                curveToRelative(-0.28f, 0.1f, -0.5f, 0.32f, -0.61f, 0.61f)
                curveToRelative(-0.04f, 0.12f, -1.07f, 2.89f, -1.07f, 7.28f)
                reflectiveCurveToRelative(1.03f, 7.16f, 1.07f, 7.28f)
                curveToRelative(0.11f, 0.29f, 0.33f, 0.51f, 0.61f, 0.61f)
                curveToRelative(0.13f, 0.04f, 3.22f, 1.11f, 9.32f, 1.11f)
                reflectiveCurveToRelative(9.19f, -1.07f, 9.32f, -1.11f)
                curveToRelative(0.28f, -0.1f, 0.5f, -0.32f, 0.61f, -0.61f)
                curveToRelative(0.04f, -0.12f, 1.07f, -2.89f, 1.07f, -7.28f)
                reflectiveCurveToRelative(-1.03f, -7.16f, -1.07f, -7.28f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _MoneyCheck = it}
