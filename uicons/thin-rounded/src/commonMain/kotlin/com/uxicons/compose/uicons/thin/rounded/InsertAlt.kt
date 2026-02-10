package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertAlt: ImageVector? = null

val Icons.Tr.InsertAlt: ImageVector
    get() = _InsertAlt ?: UXIcon(name = "InsertAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(7.26f, 12.5f)
                lineToRelative(4.1f, 4.1f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-4.24f, -4.24f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(4.24f, -4.24f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-4.1f, 4.1f)
                horizontalLineToRelative(16.24f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.11f, 15.02f)
                curveToRelative(-0.26f, -0.08f, -0.54f, 0.06f, -0.63f, 0.33f)
                curveToRelative(-1.46f, 4.58f, -5.67f, 7.65f, -10.48f, 7.65f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                curveToRelative(4.81f, 0f, 9.02f, 3.08f, 10.48f, 7.65f)
                curveToRelative(0.08f, 0.26f, 0.36f, 0.41f, 0.63f, 0.33f)
                curveToRelative(0.26f, -0.08f, 0.41f, -0.37f, 0.33f, -0.63f)
                curveTo(21.84f, 3.35f, 17.25f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(5.25f, 0f, 9.84f, -3.35f, 11.43f, -8.35f)
                curveToRelative(0.08f, -0.26f, -0.06f, -0.54f, -0.33f, -0.63f)
                close()
            }
        }.also { _InsertAlt = it}
