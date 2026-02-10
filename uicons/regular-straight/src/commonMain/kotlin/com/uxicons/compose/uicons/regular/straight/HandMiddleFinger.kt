package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandMiddleFinger: ImageVector? = null

val Icons.Rs.HandMiddleFinger: ImageVector
    get() = _HandMiddleFinger ?: UXIcon(name = "HandMiddleFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 9.11f)
                lineTo(16f, 3.11f)
                curveToRelative(0f, -1.52f, -1.08f, -2.83f, -2.5f, -3.07f)
                curveToRelative(-0.88f, -0.14f, -1.77f, 0.1f, -2.44f, 0.67f)
                curveToRelative(-0.67f, 0.57f, -1.06f, 1.4f, -1.06f, 2.29f)
                verticalLineToRelative(5.07f)
                lineToRelative(-0.14f, -0.02f)
                curveToRelative(-0.97f, -0.16f, -1.94f, 0.11f, -2.69f, 0.74f)
                curveToRelative(-0.68f, 0.58f, -1.1f, 1.4f, -1.16f, 2.29f)
                lineTo(1.88f, 15.14f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.92f, 2.16f)
                lineToRelative(5.11f, 4.58f)
                horizontalLineToRelative(14.97f)
                verticalLineToRelative(-13.84f)
                lineToRelative(-6f, -1.04f)
                close()
                moveTo(20f, 22f)
                lineTo(7.8f, 22f)
                lineToRelative(-4.5f, -4.04f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.52f, 0.29f, -0.7f)
                lineToRelative(2.71f, -2.67f)
                verticalLineToRelative(3.11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.68f)
                curveToRelative(0f, -0.39f, 0.17f, -0.75f, 0.47f, -1.0f)
                curveToRelative(0.29f, -0.25f, 0.69f, -0.36f, 1.06f, -0.29f)
                lineToRelative(2.47f, 0.43f)
                lineTo(12.0f, 3f)
                curveToRelative(0f, -0.29f, 0.13f, -0.57f, 0.35f, -0.76f)
                curveToRelative(0.23f, -0.19f, 0.52f, -0.27f, 0.82f, -0.22f)
                curveToRelative(0.46f, 0.08f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(7.69f)
                lineToRelative(6f, 1.04f)
                verticalLineToRelative(10.16f)
                close()
            }
        }.also { _HandMiddleFinger = it}
