package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PatientFile: ImageVector? = null

val Icons.Ts.PatientFile: ImageVector
    get() = _PatientFile ?: UXIcon(name = "PatientFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 8f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4.21f)
                lineToRelative(-3.79f, -3.79f)
                horizontalLineToRelative(-7.71f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17.79f, 4f)
                horizontalLineToRelative(-2.79f)
                verticalLineToRelative(-2.79f)
                close()
                moveTo(6f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-1.12f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.38f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(10.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12.5f, 15.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _PatientFile = it}
