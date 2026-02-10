package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeDelete: ImageVector? = null

val Icons.Tr.TimeDelete: ImageVector
    get() = _TimeDelete ?: UXIcon(name = "TimeDelete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 16.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(11f, 6.5f)
                verticalLineToRelative(5.22f)
                lineToRelative(-3.77f, 2.35f)
                curveToRelative(-0.23f, 0.15f, -0.3f, 0.46f, -0.16f, 0.69f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.23f, 0.42f, 0.23f)
                curveToRelative(0.09f, 0f, 0.18f, -0.02f, 0.27f, -0.08f)
                lineToRelative(4f, -2.5f)
                curveToRelative(0.15f, -0.09f, 0.23f, -0.25f, 0.23f, -0.42f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                close()
                moveTo(13.44f, 22.91f)
                curveToRelative(-0.47f, 0.06f, -0.96f, 0.09f, -1.44f, 0.09f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 0.48f, -0.03f, 0.96f, -0.09f, 1.44f)
                curveToRelative(-0.04f, 0.27f, 0.16f, 0.52f, 0.43f, 0.56f)
                curveToRelative(0.27f, 0.04f, 0.52f, -0.16f, 0.56f, -0.43f)
                curveToRelative(0.07f, -0.52f, 0.1f, -1.04f, 0.1f, -1.56f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.52f, 0f, 1.05f, -0.03f, 1.56f, -0.1f)
                curveToRelative(0.27f, -0.04f, 0.47f, -0.29f, 0.43f, -0.56f)
                curveToRelative(-0.04f, -0.27f, -0.29f, -0.47f, -0.56f, -0.43f)
                close()
            }
        }.also { _TimeDelete = it}
