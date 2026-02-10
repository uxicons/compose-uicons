package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DegreeCredential: ImageVector? = null

val Icons.Ts.DegreeCredential: ImageVector
    get() = _DegreeCredential ?: UXIcon(name = "DegreeCredential") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.95f, 0.39f, 1.8f, 1f, 2.43f)
                verticalLineToRelative(5.07f)
                lineToRelative(2.5f, -1.88f)
                lineToRelative(2.5f, 1.88f)
                verticalLineToRelative(-5.07f)
                curveToRelative(0.61f, -0.63f, 1f, -1.48f, 1f, -2.43f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17f, 22f)
                lineToRelative(-1.5f, -1.12f)
                lineToRelative(-1.5f, 1.12f)
                verticalLineToRelative(-2.35f)
                curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f)
                reflectiveCurveToRelative(1.04f, -0.13f, 1.5f, -0.35f)
                verticalLineToRelative(2.35f)
                close()
                moveTo(15.5f, 19f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(0f, 22f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                lineTo(5f, 7f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                lineTo(5f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(5.61f)
                curveToRelative(-0.16f, 0.32f, -0.29f, 0.65f, -0.39f, 1f)
                horizontalLineToRelative(-5.21f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _DegreeCredential = it}
